.class public final LI7/r$a;
.super LI7/y$d;
.source "SourceFile"

# interfaces
.implements LF7/g$a;
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final L:LI7/r;


# direct methods
.method public constructor <init>(LI7/r;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/y$d;-><init>()V

    iput-object p1, p0, LI7/r$a;->L:LI7/r;

    return-void
.end method


# virtual methods
.method public bridge synthetic G()LI7/y;
    .locals 1

    invoke-virtual {p0}, LI7/r$a;->I()LI7/r;

    move-result-object v0

    return-object v0
.end method

.method public I()LI7/r;
    .locals 1

    iget-object v0, p0, LI7/r$a;->L:LI7/r;

    return-object v0
.end method

.method public J(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LI7/r$a;->I()LI7/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LI7/r;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic a()LF7/k;
    .locals 1

    invoke-virtual {p0}, LI7/r$a;->I()LI7/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LI7/r$a;->J(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
