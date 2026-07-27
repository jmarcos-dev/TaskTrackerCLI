# Architecture

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

TaskRepository
Responsible for:
- save JSON
- load JSON

CLI
Responsible for:
- user interaction
