  document.addEventListener('DOMContentLoaded', function () {
        const questions = document.querySelectorAll('.accordion-question');
        const expandBtn = document.getElementById('expandBtn');
        const collapseBtn = document.getElementById('collapseBtn');

        // Individual toggle
        questions.forEach((question) => {
            question.addEventListener('click', function () {
                const answer = this.nextElementSibling;
                const isOpen = !answer.classList.contains('hidden');

                // Close all
                document.querySelectorAll('.accordion-answer').forEach(a => a.classList.add('hidden'));
                document.querySelectorAll('.accordion-question').forEach(q => q.classList.remove('active'));

                // Open clicked if closed
                if (!isOpen) {
                    answer.classList.remove('hidden');
                    this.classList.add('active');
                }

                // Reset button states
                expandBtn.classList.remove('active');
                collapseBtn.classList.remove('active');
            });
        });

        // Expand All
        window.expandAllAccordions = function () {
            document.querySelectorAll('.accordion-question').forEach(btn => {
                btn.classList.add('active');
                btn.nextElementSibling.classList.remove('hidden');
            });
            expandBtn.classList.add('active');
            collapseBtn.classList.remove('active');
        };

        // Collapse All
        window.collapseAllAccordions = function () {
            document.querySelectorAll('.accordion-question').forEach(btn => {
                btn.classList.remove('active');
                btn.nextElementSibling.classList.add('hidden');
            });
            collapseBtn.classList.add('active');
            expandBtn.classList.remove('active');
        };
    });