# Decisions

## Why is Status an enum?

Because a Task can only have three status:
- TODO
- IN_PROGRESS
- DONE

> This avoids writing mistakes.

---

## Why doesn't a Task save JSON?

Because Task represents data.

The Repository is responsible for saving it.
