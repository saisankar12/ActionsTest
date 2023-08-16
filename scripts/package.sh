#!/bin/bash

set -e

VERSION="$1"
CODE=$2

# shellcheck disable=SC2157
if [[ -z "VERSION" ]]; then
    echo "No Version Name Specified"
    exit 1
fi

# shellcheck disable=SC2157
if [[ -z "CODE" ]]; then
    echo "No Version Code Specified"
    exit 1
fi

./gradlew assembleNonprod -PreviousName=${VERSION} -PreviousCode=${CODE}