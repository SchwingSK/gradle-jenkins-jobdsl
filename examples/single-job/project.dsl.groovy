job {
    name 'Example Single Job'
    description 'Single job example'

    wrappers {
        // Using a 1.23+ version to test if toolVersion works
        injectPasswords()
    }
}
