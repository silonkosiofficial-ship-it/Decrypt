.class final LR/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LR/o;

.field final synthetic D:LW8/N;


# direct methods
.method constructor <init>(LR/o;LW8/N;)V
    .locals 0

    iput-object p1, p0, LR/f$a$a;->C:LR/o;

    iput-object p2, p0, LR/f$a$a;->D:LW8/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/i;

    invoke-virtual {p0, p1, p2}, LR/f$a$a;->b(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of p2, p1, Lz/n$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, LR/f$a$a;->C:LR/o;

    check-cast p1, Lz/n$b;

    iget-object v0, p0, LR/f$a$a;->D:LW8/N;

    invoke-virtual {p2, p1, v0}, LR/o;->e(Lz/n$b;LW8/N;)V

    goto :goto_1

    :cond_0
    instance-of p2, p1, Lz/n$c;

    if-eqz p2, :cond_1

    iget-object p2, p0, LR/f$a$a;->C:LR/o;

    check-cast p1, Lz/n$c;

    invoke-virtual {p1}, Lz/n$c;->a()Lz/n$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, LR/o;->g(Lz/n$b;)V

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lz/n$a;

    if-eqz p2, :cond_2

    iget-object p2, p0, LR/f$a$a;->C:LR/o;

    check-cast p1, Lz/n$a;

    invoke-virtual {p1}, Lz/n$a;->a()Lz/n$b;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p2, p0, LR/f$a$a;->C:LR/o;

    iget-object v0, p0, LR/f$a$a;->D:LW8/N;

    invoke-virtual {p2, p1, v0}, LR/o;->h(Lz/i;LW8/N;)V

    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
