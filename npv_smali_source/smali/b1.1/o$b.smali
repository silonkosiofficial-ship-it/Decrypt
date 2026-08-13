.class final Lb1/o$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/o;-><init>(Lb1/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb1/o;


# direct methods
.method constructor <init>(Lb1/o;)V
    .locals 0

    iput-object p1, p0, Lb1/o$b;->D:Lb1/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/a;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb1/o$b;->D:Lb1/o;

    invoke-static {v0}, Lb1/o;->f(Lb1/o;)LW8/N;

    move-result-object v1

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    invoke-virtual {v0}, LW8/J0;->z1()LW8/J0;

    move-result-object v2

    new-instance v4, Lb1/o$b$a;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lb1/o$b$a;-><init>(Lx7/a;Lm7/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/a;

    invoke-virtual {p0, p1}, Lb1/o$b;->a(Lx7/a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
