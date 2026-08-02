# Architecture
# Layered design

The application is split into three layers with a clear dependency direction:

Main → CLI → TaskManager → Model

The presentation layer (CLI) depends on the business layer (TaskManager), but the business layer has no knowledge of the presentation layer. TaskManager never prints to the console — it only returns data. This keeps the business logic testable and would allow replacing the CLI with a REST API without touching the core.
## Classes

Task

Responsible for representing a task.
It has:
- id
- name
- description
- status

TaskManager
Responsible for:
- create tasks
- remove tasks
- update tasks

CLI
Responsible for:
- user interaction
