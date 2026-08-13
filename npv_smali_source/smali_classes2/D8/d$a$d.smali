.class final LD8/d$a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d$a;-><init>(LD8/d;LG8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d$a;


# direct methods
.method constructor <init>(LD8/d$a;)V
    .locals 0

    iput-object p1, p0, LD8/d$a$d;->D:LD8/d$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, LD8/d$a$d;->D:LD8/d$a;

    invoke-static {v0}, LD8/d$a;->z(LD8/d$a;)LG8/g;

    move-result-object v0

    iget-object v1, p0, LD8/d$a$d;->D:LD8/d$a;

    invoke-static {v1}, LD8/d$a;->y(LD8/d$a;)LD8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LG8/g;->g(LO7/e;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/d$a$d;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
