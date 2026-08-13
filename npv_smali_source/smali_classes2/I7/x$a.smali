.class public final LI7/x$a;
.super LI7/y$c;
.source "SourceFile"

# interfaces
.implements LF7/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final L:LI7/x;


# direct methods
.method public constructor <init>(LI7/x;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/y$c;-><init>()V

    iput-object p1, p0, LI7/x$a;->L:LI7/x;

    return-void
.end method


# virtual methods
.method public bridge synthetic G()LI7/y;
    .locals 1

    invoke-virtual {p0}, LI7/x$a;->I()LI7/x;

    move-result-object v0

    return-object v0
.end method

.method public I()LI7/x;
    .locals 1

    iget-object v0, p0, LI7/x$a;->L:LI7/x;

    return-object v0
.end method

.method public bridge synthetic a()LF7/k;
    .locals 1

    invoke-virtual {p0}, LI7/x$a;->I()LI7/x;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/x$a;->I()LI7/x;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LI7/x;->w(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
