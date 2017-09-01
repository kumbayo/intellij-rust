/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.ide

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.impl.PsiTreeChangeEventImpl
import com.intellij.psi.impl.PsiTreeChangePreprocessorBase
import org.rust.lang.RsLanguage
import org.rust.lang.core.psi.RsFile

class RustTreeChangePreprocessor(psiManager: PsiManager) : PsiTreeChangePreprocessorBase(psiManager) {
    override fun acceptsEvent(event: PsiTreeChangeEventImpl): Boolean =
        event.file is RsFile

    override fun isOutOfCodeBlock(element: PsiElement): Boolean =
        element.language is RsLanguage
}
