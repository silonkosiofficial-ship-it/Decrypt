.class final LR/q$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/q$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LR/q;

.field final synthetic D:LW8/N;


# direct methods
.method constructor <init>(LR/q;LW8/N;)V
    .locals 0

    iput-object p1, p0, LR/q$a$a;->C:LR/q;

    iput-object p2, p0, LR/q$a$a;->D:LW8/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/i;

    invoke-virtual {p0, p1, p2}, LR/q$a$a;->b(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of p2, p1, Lz/n;

    if-eqz p2, :cond_1

    iget-object p2, p0, LR/q$a$a;->C:LR/q;

    invoke-static {p2}, LR/q;->T1(LR/q;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LR/q$a$a;->C:LR/q;

    check-cast p1, Lz/n;

    invoke-static {p2, p1}, LR/q;->W1(LR/q;Lz/n;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LR/q$a$a;->C:LR/q;

    invoke-static {p2}, LR/q;->V1(LR/q;)Lr/I;

    move-result-object p2

    invoke-virtual {p2, p1}, Lr/I;->g(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, LR/q$a$a;->C:LR/q;

    iget-object v0, p0, LR/q$a$a;->D:LW8/N;

    invoke-static {p2, p1, v0}, LR/q;->X1(LR/q;Lz/i;LW8/N;)V

    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
