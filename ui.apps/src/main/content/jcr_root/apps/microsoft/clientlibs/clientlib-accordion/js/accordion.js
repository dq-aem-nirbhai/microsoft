document.addEventListener('DOMContentLoaded', function () {
        const questions = document.querySelectorAll('.accordion-question');

        questions.forEach((question) => {
            question.addEventListener('click', function () {
                const answer = this.nextElementSibling;
                const isOpen = !answer.classList.contains('hidden');

                // Collapse all
                document.querySelectorAll('.accordion-answer').forEach(a => a.classList.add('hidden'));
                document.querySelectorAll('.accordion-question').forEach(q => q.classList.remove('active'));

                // Expand only if it was previously closed
                if (!isOpen) {
                    answer.classList.remove('hidden');
                    this.classList.add('active');
                }
            });
        });
    });

    function expandAllAccordions() {
        document.querySelectorAll('.accordion-answer').forEach(answer => {
            answer.classList.remove('hidden');
        });
        document.querySelectorAll('.accordion-question').forEach(q => q.classList.add('active'));
    }

    function collapseAllAccordions() {
        document.querySelectorAll('.accordion-answer').forEach(answer => {
            answer.classList.add('hidden');
        });
        document.querySelectorAll('.accordion-question').forEach(q => q.classList.remove('active'));
    }