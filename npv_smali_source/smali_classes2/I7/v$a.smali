.class public final LI7/v$a;
.super LI7/y$c;
.source "SourceFile"

# interfaces
.implements LF7/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final L:LI7/v;


# direct methods
.method public constructor <init>(LI7/v;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/y$c;-><init>()V

    iput-object p1, p0, LI7/v$a;->L:LI7/v;

    return-void
.end method


# virtual methods
.method public bridge synthetic G()LI7/y;
    .locals 1

    invoke-virtual {p0}, LI7/v$a;->I()LI7/v;

    move-result-object v0

    return-object v0
.end method

.method public I()LI7/v;
    .locals 1

    iget-object v0, p0, LI7/v$a;->L:LI7/v;

    return-object v0
.end method

.method public bridge synthetic a()LF7/k;
    .locals 1

    invoke-virtual {p0}, LI7/v$a;->I()LI7/v;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/v$a;->I()LI7/v;

    move-result-object v0

    invoke-virtual {v0}, LI7/v;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
