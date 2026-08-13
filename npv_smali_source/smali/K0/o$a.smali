.class final LK0/o$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/o;->b(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LK0/h;


# direct methods
.method constructor <init>(LK0/h;)V
    .locals 0

    iput-object p1, p0, LK0/o$a;->D:LK0/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 1

    iget-object v0, p0, LK0/o$a;->D:LK0/h;

    invoke-virtual {v0}, LK0/h;->n()I

    move-result v0

    invoke-static {p1, v0}, LK0/u;->X(LK0/w;I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LK0/o$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
