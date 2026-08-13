.class final Lg9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/b;->b(Ll4/l;Ll4/b;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW8/l;


# direct methods
.method constructor <init>(LW8/l;)V
    .locals 0

    iput-object p1, p0, Lg9/b$a;->a:LW8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll4/l;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lg9/b$a;->a:LW8/l;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LW8/l$a;->a(LW8/l;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg9/b$a;->a:LW8/l;

    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lg9/b$a;->a:LW8/l;

    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {v0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
