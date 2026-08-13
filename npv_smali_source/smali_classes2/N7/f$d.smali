.class final LN7/f$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/f;-><init>(LE8/n;LN7/f$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/f;

.field final synthetic E:LE8/n;


# direct methods
.method constructor <init>(LN7/f;LE8/n;)V
    .locals 0

    iput-object p1, p0, LN7/f$d;->D:LN7/f;

    iput-object p2, p0, LN7/f$d;->E:LE8/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN7/i;
    .locals 5

    new-instance v0, LN7/i;

    iget-object v1, p0, LN7/f$d;->D:LN7/f;

    invoke-virtual {v1}, LL7/g;->r()LR7/x;

    move-result-object v1

    const-string v2, "getBuiltInsModule(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LN7/f$d;->E:LE8/n;

    new-instance v3, LN7/f$d$a;

    iget-object v4, p0, LN7/f$d;->D:LN7/f;

    invoke-direct {v3, v4}, LN7/f$d$a;-><init>(LN7/f;)V

    invoke-direct {v0, v1, v2, v3}, LN7/i;-><init>(LO7/G;LE8/n;Lx7/a;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/f$d;->a()LN7/i;

    move-result-object v0

    return-object v0
.end method
