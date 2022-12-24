listView('hello-view') {
    description('View of hello-jobs.')

    jobs {
        regex(/hello-(.+-)?job/)
    }

    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
