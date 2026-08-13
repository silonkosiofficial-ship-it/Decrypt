.class public final Li9/J$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lk9/x;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk9/x;

    sget-object v1, Li9/J$c$a;->K:Li9/J$c$a;

    invoke-direct {v0, v1}, Lk9/x;-><init>(LF7/i;)V

    iput-object v0, p0, Li9/J$c;->a:Lk9/x;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Li9/V;

    invoke-virtual {p0, p1}, Li9/J$c;->d(Li9/V;)Z

    move-result p1

    return p1
.end method

.method public b()Lk9/x;
    .locals 1

    iget-object v0, p0, Li9/J$c;->a:Lk9/x;

    return-object v0
.end method

.method public bridge synthetic c()Lk9/b;
    .locals 1

    invoke-virtual {p0}, Li9/J$c;->b()Lk9/x;

    move-result-object v0

    return-object v0
.end method

.method public d(Li9/V;)Z
    .locals 2

    .prologue
    const-string v0, "obj"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Li9/V;->h()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_3

    invoke-interface {p1}, Li9/V;->u()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-nez v0, :cond_3

    invoke-interface {p1}, Li9/V;->l()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method
