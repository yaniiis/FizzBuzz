## Repo snapshot

- Root files: `README.md` (very small; contains "# FizzBuzz").
- No language, build files, or tests detected.

## Goal for AI assistants

- Implement or extend simple algorithmic exercises (FizzBuzz). Keep changes minimal and self-contained.
- Ask a clarifying question if the language, target environment, or test framework is not specified.

## Quick checklist (what to do first)

1. Read `README.md` to understand the stated goal.
2. If the language is unspecified, ask: "Which language and runtime should I use? (e.g. Python, JavaScript, Java)."
3. Prefer adding a single source file in the repository root or `src/` and a small test harness under `tests/` or `test/`.

## Project-specific conventions and examples

- This repository currently contains only `README.md`. Expect tiny, self-contained solutions.
- Example: If asked to add a Python solution, create `fizzbuzz.py` at repo root with a `fizzbuzz(n)` function and a simple `if __name__ == '__main__'` runner.
- Example test layout: `tests/test_fizzbuzz.py` using `pytest` with a few assertions for typical values (1, 3, 5, 15).

## Developer workflow notes (discoverable / conservative defaults)

- No build or test commands found. Use conservative, common commands depending on language:
  - Python: `python -m pytest` (add `requirements.txt` only if external deps are needed)
  - JavaScript: `node` for run, `npm init -y` + `npm test` when adding tests
- When adding tooling or dependencies, include a short README update describing how to run tests.

## Safety: what not to assume

- Do not pick a language or framework without asking if it's not specified.
- Avoid adding large frameworks or CI config unless requested.

## PR & commit guidance for AI

- Make a single focused change per PR with a descriptive commit message (e.g., "Add Python fizzbuzz solver and pytest tests").
- Update `README.md` if you add run/test instructions.

## When you need more context (asks to make to humans)

- "Which language/runtime should I use?"
- "Do you want tests, and if so which test framework (pytest, jest, junit)?"
- "Should the solution be interactive (CLI) or a library function?"

---
If anything here is unclear or you want a different default language or test framework, tell me which one and I will update this guidance and implement the solution accordingly.
