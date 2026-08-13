.class public final Lf4/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL4/b;


# instance fields
.field private final a:Landroid/app/Application;

.field private final b:Lf4/Z;

.field private final c:Lf4/q;

.field private final d:Lf4/S;

.field private final e:Lf4/W0;

.field private f:Landroid/app/Dialog;

.field private g:Lf4/X;

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final i:Ljava/util/concurrent/atomic/AtomicReference;

.field private final j:Ljava/util/concurrent/atomic/AtomicReference;

.field private final k:Ljava/util/concurrent/atomic/AtomicReference;

.field l:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Lf4/c;Lf4/Z;Lf4/q;Lf4/S;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p2, p0, Lf4/D;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lf4/D;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lf4/D;->j:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lf4/D;->k:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lf4/D;->l:Z

    iput-object p1, p0, Lf4/D;->a:Landroid/app/Application;

    iput-object p3, p0, Lf4/D;->b:Lf4/Z;

    iput-object p4, p0, Lf4/D;->c:Lf4/q;

    iput-object p5, p0, Lf4/D;->d:Lf4/S;

    iput-object p6, p0, Lf4/D;->e:Lf4/W0;

    return-void
.end method

.method static bridge synthetic b(Lf4/D;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lf4/D;->a:Landroid/app/Application;

    return-object p0
.end method

.method static bridge synthetic c(Lf4/D;)Landroid/app/Dialog;
    .locals 0

    iget-object p0, p0, Lf4/D;->f:Landroid/app/Dialog;

    return-object p0
.end method

.method static bridge synthetic e(Lf4/D;)Lf4/Z;
    .locals 0

    iget-object p0, p0, Lf4/D;->b:Lf4/Z;

    return-object p0
.end method

.method static bridge synthetic f(Lf4/D;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lf4/D;->k:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method private final l()V
    .locals 2

    .prologue
    iget-object v0, p0, Lf4/D;->f:Landroid/app/Dialog;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iput-object v1, p0, Lf4/D;->f:Landroid/app/Dialog;

    :cond_0
    iget-object v0, p0, Lf4/D;->b:Lf4/Z;

    invoke-virtual {v0, v1}, Lf4/Z;->a(Landroid/app/Activity;)V

    iget-object v0, p0, Lf4/D;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/z;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lf4/z;->a(Lf4/z;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;LL4/b$a;)V
    .locals 4

    .prologue
    invoke-static {}, Lf4/v0;->a()V

    iget-object v0, p0, Lf4/D;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x3

    if-nez v0, :cond_1

    new-instance p1, Lf4/Z0;

    iget-boolean v0, p0, Lf4/D;->l:Z

    if-eq v2, v0, :cond_0

    const-string v0, "ConsentForm#show can only be invoked once."

    goto :goto_0

    :cond_0
    const-string v0, "Privacy options form is being loading. Please try again later."

    :goto_0
    invoke-direct {p1, v3, v0}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1}, Lf4/Z0;->a()LL4/e;

    move-result-object p1

    invoke-interface {p2, p1}, LL4/b$a;->a(LL4/e;)V

    return-void

    :cond_1
    iget-object v0, p0, Lf4/D;->g:Lf4/X;

    invoke-virtual {v0}, Lf4/X;->c()V

    new-instance v0, Lf4/z;

    invoke-direct {v0, p0, p1}, Lf4/z;-><init>(Lf4/D;Landroid/app/Activity;)V

    iget-object v2, p0, Lf4/D;->a:Landroid/app/Application;

    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v2, p0, Lf4/D;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lf4/D;->b:Lf4/Z;

    invoke-virtual {v0, p1}, Lf4/Z;->a(Landroid/app/Activity;)V

    new-instance v0, Landroid/app/Dialog;

    const v2, 0x1030010

    invoke-direct {v0, p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iget-object p1, p0, Lf4/D;->g:Lf4/X;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_2

    new-instance p1, Lf4/Z0;

    const-string v0, "Activity with null windows is passed in."

    invoke-direct {p1, v3, v0}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1}, Lf4/Z0;->a()LL4/e;

    move-result-object p1

    invoke-interface {p2, p1}, LL4/b$a;->a(LL4/e;)V

    return-void

    :cond_2
    const/4 v2, -0x1

    invoke-virtual {p1, v2, v2}, Landroid/view/Window;->setLayout(II)V

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/high16 v2, 0x1000000

    invoke-virtual {p1, v2, v2}, Landroid/view/Window;->setFlags(II)V

    invoke-static {p1, v1}, Landroidx/core/view/k0;->b(Landroid/view/Window;Z)V

    iget-object p1, p0, Lf4/D;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iput-object v0, p0, Lf4/D;->f:Landroid/app/Dialog;

    iget-object p1, p0, Lf4/D;->g:Lf4/X;

    const-string p2, "UMP_messagePresented"

    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Lf4/X;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final d()Lf4/X;
    .locals 1

    iget-object v0, p0, Lf4/D;->g:Lf4/X;

    return-object v0
.end method

.method final g(LL4/f$b;LL4/f$a;)V
    .locals 7

    iget-object v0, p0, Lf4/D;->e:Lf4/W0;

    check-cast v0, Lf4/Y;

    invoke-virtual {v0}, Lf4/Y;->b()Lf4/X;

    move-result-object v0

    iput-object v0, p0, Lf4/D;->g:Lf4/X;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    new-instance v1, Lf4/W;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lf4/W;-><init>(Lf4/X;Lf4/V;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v0, Lf4/C;

    invoke-direct {v0, p1, p2, v2}, Lf4/C;-><init>(LL4/f$b;LL4/f$a;Lf4/A;)V

    iget-object p1, p0, Lf4/D;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Lf4/D;->g:Lf4/X;

    iget-object p1, p0, Lf4/D;->d:Lf4/S;

    invoke-virtual {p1}, Lf4/S;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lf4/S;->b()Ljava/lang/String;

    move-result-object v3

    const-string v5, "UTF-8"

    const/4 v6, 0x0

    const-string v4, "text/html"

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lf4/v0;->a:Landroid/os/Handler;

    new-instance p2, Lf4/y;

    invoke-direct {p2, p0}, Lf4/y;-><init>(Lf4/D;)V

    const-wide/16 v0, 0x2710

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method final h(I)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lf4/D;->l()V

    iget-object p1, p0, Lf4/D;->j:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL4/b$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lf4/D;->c:Lf4/q;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lf4/q;->f(I)V

    invoke-interface {p1, v0}, LL4/b$a;->a(LL4/e;)V

    return-void
.end method

.method final i(Lf4/Z0;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Lf4/D;->l()V

    iget-object v0, p0, Lf4/D;->j:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL4/b$a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lf4/Z0;->a()LL4/e;

    move-result-object p1

    invoke-interface {v0, p1}, LL4/b$a;->a(LL4/e;)V

    return-void
.end method

.method final j()V
    .locals 2

    .prologue
    iget-object v0, p0, Lf4/D;->i:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/C;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p0}, Lf4/C;->a(LL4/b;)V

    return-void
.end method

.method final k(Lf4/Z0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lf4/D;->i:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/C;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lf4/Z0;->a()LL4/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf4/C;->b(LL4/e;)V

    return-void
.end method
