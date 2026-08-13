.class final Lu/s0$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/s0;->e(Ljava/lang/Object;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LW8/N;

.field final synthetic E:Lu/s0;


# direct methods
.method constructor <init>(LW8/N;Lu/s0;)V
    .locals 0

    iput-object p1, p0, Lu/s0$e;->D:LW8/N;

    iput-object p2, p0, Lu/s0$e;->E:Lu/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 6

    iget-object v0, p0, Lu/s0$e;->D:LW8/N;

    sget-object v2, LW8/P;->F:LW8/P;

    new-instance v3, Lu/s0$e$a;

    iget-object p1, p0, Lu/s0$e;->E:Lu/s0;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lu/s0$e$a;-><init>(Lu/s0;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance p1, Lu/s0$e$b;

    invoke-direct {p1}, Lu/s0$e$b;-><init>()V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Lu/s0$e;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
