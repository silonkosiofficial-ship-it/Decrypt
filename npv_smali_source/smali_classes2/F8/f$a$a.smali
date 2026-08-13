.class final LF8/f$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/f$a;-><init>(LF8/f;LG8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/f$a;

.field final synthetic E:LF8/f;


# direct methods
.method constructor <init>(LF8/f$a;LF8/f;)V
    .locals 0

    iput-object p1, p0, LF8/f$a$a;->D:LF8/f$a;

    iput-object p2, p0, LF8/f$a$a;->E:LF8/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LF8/f$a$a;->D:LF8/f$a;

    invoke-static {v0}, LF8/f$a;->b(LF8/f$a;)LG8/g;

    move-result-object v0

    iget-object v1, p0, LF8/f$a$a;->E:LF8/f;

    invoke-virtual {v1}, LF8/f;->l()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LG8/h;->b(LG8/g;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF8/f$a$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
