package com.github.cpdncristiano.getx_snippets;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

class GetxTemplateContext extends TemplateContextType {
    protected GetxTemplateContext() {
        super("FLUTTER", "Flutter");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".dart");
    }
}