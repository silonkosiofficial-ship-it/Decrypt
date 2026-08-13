.class public final Lr0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lr0/c;

.field private b:Lr0/c;

.field private c:Lr/L;

.field private d:Lr/L;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lr0/a;)Lr/L;
    .locals 0

    iget-object p0, p0, Lr0/a;->c:Lr/L;

    return-object p0
.end method

.method public static final synthetic b(Lr0/a;)Lr0/c;
    .locals 0

    iget-object p0, p0, Lr0/a;->a:Lr0/c;

    return-object p0
.end method

.method public static final synthetic c(Lr0/a;)Lr/L;
    .locals 0

    iget-object p0, p0, Lr0/a;->d:Lr/L;

    return-object p0
.end method

.method public static final synthetic d(Lr0/a;)Lr0/c;
    .locals 0

    iget-object p0, p0, Lr0/a;->b:Lr0/c;

    return-object p0
.end method

.method public static final synthetic e(Lr0/a;Lr0/c;)V
    .locals 0

    iput-object p1, p0, Lr0/a;->a:Lr0/c;

    return-void
.end method

.method public static final synthetic f(Lr0/a;Lr/L;)V
    .locals 0

    iput-object p1, p0, Lr0/a;->d:Lr/L;

    return-void
.end method

.method public static final synthetic g(Lr0/a;Lr0/c;)V
    .locals 0

    iput-object p1, p0, Lr0/a;->b:Lr0/c;

    return-void
.end method

.method public static final synthetic h(Lr0/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/a;->e:Z

    return-void
.end method


# virtual methods
.method public final i(Lr0/c;)Z
    .locals 3

    .prologue
    iget-boolean v0, p0, Lr0/a;->e:Z

    if-nez v0, :cond_0

    const-string v0, "Only add dependencies during a tracking"

    invoke-static {v0}, Lo0/H1;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lr0/a;->c:Lr/L;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lr/L;->h(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lr0/a;->a:Lr0/c;

    if-eqz v0, :cond_2

    invoke-static {}, Lr/X;->a()Lr/L;

    move-result-object v0

    iget-object v2, p0, Lr0/a;->a:Lr0/c;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lr/L;->h(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, Lr/L;->h(Ljava/lang/Object;)Z

    iput-object v0, p0, Lr0/a;->c:Lr/L;

    iput-object v1, p0, Lr0/a;->a:Lr0/c;

    goto :goto_0

    :cond_2
    iput-object p1, p0, Lr0/a;->a:Lr0/c;

    :goto_0
    iget-object v0, p0, Lr0/a;->d:Lr/L;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lr/L;->x(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_3
    iget-object v0, p0, Lr0/a;->b:Lr0/c;

    if-eq v0, p1, :cond_4

    return v2

    :cond_4
    iput-object v1, p0, Lr0/a;->b:Lr0/c;

    const/4 p1, 0x0

    return p1
.end method
