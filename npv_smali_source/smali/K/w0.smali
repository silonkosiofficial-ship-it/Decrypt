.class public final LK/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field private final a:LK/k0;

.field private final b:Z

.field private final c:LH/w;

.field private final d:LN/F;

.field private final e:Landroidx/compose/ui/platform/A1;

.field private f:I

.field private g:LS0/V;

.field private h:I

.field private i:Z

.field private final j:Ljava/util/List;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS0/V;LK/k0;ZLH/w;LN/F;Landroidx/compose/ui/platform/A1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LK/w0;->a:LK/k0;

    iput-boolean p3, p0, LK/w0;->b:Z

    iput-object p4, p0, LK/w0;->c:LH/w;

    iput-object p5, p0, LK/w0;->d:LN/F;

    iput-object p6, p0, LK/w0;->e:Landroidx/compose/ui/platform/A1;

    iput-object p1, p0, LK/w0;->g:LS0/V;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LK/w0;->j:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, LK/w0;->k:Z

    return-void
.end method

.method public static final synthetic b(LK/w0;LS0/i;)V
    .locals 0

    invoke-direct {p0, p1}, LK/w0;->c(LS0/i;)V

    return-void
.end method

.method private final c(LS0/i;)V
    .locals 1

    .prologue
    invoke-direct {p0}, LK/w0;->d()Z

    :try_start_0
    iget-object v0, p0, LK/w0;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, LK/w0;->e()Z

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, LK/w0;->e()Z

    throw p1
.end method

.method private final d()Z
    .locals 2

    iget v0, p0, LK/w0;->f:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LK/w0;->f:I

    return v1
.end method

.method private final e()Z
    .locals 3

    .prologue
    iget v0, p0, LK/w0;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LK/w0;->f:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, LK/w0;->j:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, LK/w0;->a:LK/k0;

    iget-object v2, p0, LK/w0;->j:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, LK/k0;->d(Ljava/util/List;)V

    iget-object v0, p0, LK/w0;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    iget v0, p0, LK/w0;->f:I

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final f(I)V
    .locals 2

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p0, v0}, LK/w0;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p0, v0}, LK/w0;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method


# virtual methods
.method public beginBatchEdit()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, LK/w0;->d()Z

    move-result v0

    :cond_0
    return v0
.end method

.method public clearMetaKeyStates(I)Z
    .locals 0

    .prologue
    iget-boolean p1, p0, LK/w0;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public closeConnection()V
    .locals 1

    iget-object v0, p0, LK/w0;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput v0, p0, LK/w0;->f:I

    iput-boolean v0, p0, LK/w0;->k:Z

    iget-object v0, p0, LK/w0;->a:LK/k0;

    invoke-interface {v0, p0}, LK/k0;->e(LK/w0;)V

    return-void
.end method

.method public commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 0

    .prologue
    iget-boolean p1, p0, LK/w0;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    .prologue
    iget-boolean p1, p0, LK/w0;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 0

    .prologue
    iget-boolean p1, p0, LK/w0;->k:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LK/w0;->b:Z

    :cond_0
    return p1
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v1, LS0/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, LS0/a;-><init>(Ljava/lang/String;I)V

    invoke-direct {p0, v1}, LK/w0;->c(LS0/i;)V

    :cond_0
    return v0
.end method

.method public deleteSurroundingText(II)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, LS0/g;

    invoke-direct {v0, p1, p2}, LS0/g;-><init>(II)V

    invoke-direct {p0, v0}, LK/w0;->c(LS0/i;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, LS0/h;

    invoke-direct {v0, p1, p2}, LS0/h;-><init>(II)V

    invoke-direct {p0, v0}, LK/w0;->c(LS0/i;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public endBatchEdit()Z
    .locals 1

    invoke-direct {p0}, LK/w0;->e()Z

    move-result v0

    return v0
.end method

.method public finishComposingText()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, LS0/n;

    invoke-direct {v0}, LS0/n;-><init>()V

    invoke-direct {p0, v0}, LK/w0;->c(LS0/i;)V

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final g(LS0/V;)V
    .locals 0

    iput-object p1, p0, LK/w0;->g:LS0/V;

    return-void
.end method

.method public getCursorCapsMode(I)I
    .locals 3

    iget-object v0, p0, LK/w0;->g:LS0/V;

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LK/w0;->g:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result v1

    invoke-static {v0, v1, p1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    .prologue
    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LK/w0;->i:Z

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget v1, p1, Landroid/view/inputmethod/ExtractedTextRequest;->token:I

    :cond_1
    iput v1, p0, LK/w0;->h:I

    :cond_2
    iget-object p1, p0, LK/w0;->g:LS0/V;

    invoke-static {p1}, LK/x0;->a(LS0/V;)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    return-object p1
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSelectedText(I)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    iget-object p1, p0, LK/w0;->g:LS0/V;

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LK/w0;->g:LS0/V;

    invoke-static {p1}, LS0/W;->a(LS0/V;)LM0/d;

    move-result-object p1

    invoke-virtual {p1}, LM0/d;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 0

    iget-object p2, p0, LK/w0;->g:LS0/V;

    invoke-static {p2, p1}, LS0/W;->b(LS0/V;I)LM0/d;

    move-result-object p1

    invoke-virtual {p1}, LM0/d;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 0

    iget-object p2, p0, LK/w0;->g:LS0/V;

    invoke-static {p2, p1}, LS0/W;->c(LS0/V;I)LM0/d;

    move-result-object p1

    invoke-virtual {p1}, LM0/d;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(LS0/V;LK/l0;)V
    .locals 5

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LK/w0;->g(LS0/V;)V

    iget-boolean v0, p0, LK/w0;->i:Z

    if-eqz v0, :cond_1

    iget v0, p0, LK/w0;->h:I

    invoke-static {p1}, LK/x0;->a(LS0/V;)Landroid/view/inputmethod/ExtractedText;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LK/l0;->g(ILandroid/view/inputmethod/ExtractedText;)V

    :cond_1
    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LM0/N;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->l(J)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LM0/N;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result v1

    :cond_3
    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->l(J)I

    move-result v2

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->k(J)I

    move-result p1

    invoke-interface {p2, v2, p1, v0, v1}, LK/l0;->h(IIII)V

    return-void
.end method

.method public performContextMenuAction(I)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 p1, 0x117

    :goto_0
    invoke-direct {p0, p1}, LK/w0;->f(I)V

    goto :goto_1

    :pswitch_1
    const/16 p1, 0x116

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x115

    goto :goto_0

    :pswitch_3
    new-instance p1, LS0/U;

    iget-object v1, p0, LK/w0;->g:LS0/V;

    invoke-virtual {v1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {p1, v0, v1}, LS0/U;-><init>(II)V

    invoke-direct {p0, p1}, LK/w0;->c(LS0/i;)V

    :cond_0
    :goto_1
    return v0

    :pswitch_data_0
    .packed-switch 0x102001f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public performEditorAction(I)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IME sends unsupported Editor Action: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RecordingIC"

    nop

    :cond_0
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->a()I

    move-result p1

    goto :goto_0

    :pswitch_0
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->f()I

    move-result p1

    goto :goto_0

    :pswitch_1
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->b()I

    move-result p1

    goto :goto_0

    :pswitch_2
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->d()I

    move-result p1

    goto :goto_0

    :pswitch_3
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->h()I

    move-result p1

    goto :goto_0

    :pswitch_4
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->g()I

    move-result p1

    goto :goto_0

    :pswitch_5
    sget-object p1, LS0/r;->b:LS0/r$a;

    invoke-virtual {p1}, LS0/r$a;->c()I

    move-result p1

    :goto_0
    iget-object v0, p0, LK/w0;->a:LK/k0;

    invoke-interface {v0, p1}, LK/k0;->c(I)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 10

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v2, LK/c;->a:LK/c;

    iget-object v3, p0, LK/w0;->c:LH/w;

    iget-object v4, p0, LK/w0;->d:LN/F;

    iget-object v6, p0, LK/w0;->e:Landroidx/compose/ui/platform/A1;

    new-instance v9, LK/w0$a;

    invoke-direct {v9, p0}, LK/w0$a;-><init>(LK/w0;)V

    move-object v5, p1

    move-object v7, p2

    move-object v8, p3

    invoke-virtual/range {v2 .. v9}, LK/c;->b(LH/w;LN/F;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/A1;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lx7/l;)V

    :cond_0
    return-void
.end method

.method public performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    .prologue
    iget-boolean p1, p0, LK/w0;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 3

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LK/c;->a:LK/c;

    iget-object v1, p0, LK/w0;->c:LH/w;

    iget-object v2, p0, LK/w0;->d:LN/F;

    invoke-virtual {v0, v1, v2, p1, p2}, LK/c;->d(LH/w;LN/F;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public reportFullscreenMode(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public requestCursorUpdates(I)Z
    .locals 10

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_9

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v0, v3, :cond_8

    and-int/lit8 v3, p1, 0x10

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v6, p1, 0x8

    if-eqz v6, :cond_3

    move v6, v2

    goto :goto_3

    :cond_3
    move v6, v1

    :goto_3
    and-int/lit8 v7, p1, 0x4

    if-eqz v7, :cond_4

    move v7, v2

    goto :goto_4

    :cond_4
    move v7, v1

    :goto_4
    const/16 v8, 0x22

    if-lt v0, v8, :cond_5

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    if-nez v3, :cond_7

    if-nez v6, :cond_7

    if-nez v7, :cond_7

    if-nez v1, :cond_7

    if-lt v0, v8, :cond_6

    move v6, v2

    move v7, v6

    move v8, v7

    move v9, v8

    goto :goto_5

    :cond_6
    move v9, v1

    move v6, v2

    move v7, v6

    move v8, v7

    goto :goto_5

    :cond_7
    move v9, v1

    move v8, v7

    move v7, v6

    move v6, v3

    goto :goto_5

    :cond_8
    move v8, v1

    move v9, v8

    move v6, v2

    move v7, v6

    :goto_5
    iget-object v3, p0, LK/w0;->a:LK/k0;

    invoke-interface/range {v3 .. v9}, LK/k0;->b(ZZZZZZ)V

    return v2

    :cond_9
    return v0
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LK/w0;->a:LK/k0;

    invoke-interface {v0, p1}, LK/k0;->a(Landroid/view/KeyEvent;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public setComposingRegion(II)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v1, LS0/S;

    invoke-direct {v1, p1, p2}, LS0/S;-><init>(II)V

    invoke-direct {p0, v1}, LK/w0;->c(LS0/i;)V

    :cond_0
    return v0
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v1, LS0/T;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, LS0/T;-><init>(Ljava/lang/String;I)V

    invoke-direct {p0, v1}, LK/w0;->c(LS0/i;)V

    :cond_0
    return v0
.end method

.method public setSelection(II)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LK/w0;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, LS0/U;

    invoke-direct {v0, p1, p2}, LS0/U;-><init>(II)V

    invoke-direct {p0, v0}, LK/w0;->c(LS0/i;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
