module.exports = {
    root: true,
    extends: '@react-native-community',
    rules: {
        'prettier/prettier': 0,
        'semi': ['error', 'always'],
        'indent': ['error', 4],
        'object-curly-spacing': ['error', 'never'],
        'quotes': ['error', 'single'],
        'no-var': 'error',
        'jsx-quotes': ['error', 'prefer-single'],
        'react/jsx-max-props-per-line': ['error', {maximum: 1, when: 'always'}],
        'eqeqeq': ['error', 'always'],
        'react-hooks/exhaustive-deps': 'warn',
    },
};
