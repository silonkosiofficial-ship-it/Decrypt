.class final LN7/i$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;->m(LO7/e;Lx7/l;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/f;

.field final synthetic E:LO7/e;


# direct methods
.method constructor <init>(Lb8/f;LO7/e;)V
    .locals 0

    iput-object p1, p0, LN7/i$g;->D:Lb8/f;

    iput-object p2, p0, LN7/i$g;->E:LO7/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/e;
    .locals 3

    iget-object v0, p0, LN7/i$g;->D:Lb8/f;

    sget-object v1, LY7/g;->a:LY7/g;

    const-string v2, "EMPTY"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LN7/i$g;->E:LO7/e;

    invoke-virtual {v0, v1, v2}, Lb8/f;->W0(LY7/g;LO7/e;)Lb8/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/i$g;->a()LO7/e;

    move-result-object v0

    return-object v0
.end method
