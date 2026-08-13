.class public final LZ2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field private final a:Lh7/a;

.field private final b:Lh7/a;


# direct methods
.method public constructor <init>(Lh7/a;Lh7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ2/l;->a:Lh7/a;

    iput-object p2, p0, LZ2/l;->b:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;)LZ2/l;
    .locals 1

    new-instance v0, LZ2/l;

    invoke-direct {v0, p0, p1}, LZ2/l;-><init>(Lh7/a;Lh7/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)LZ2/k;
    .locals 1

    new-instance v0, LZ2/k;

    check-cast p1, LZ2/i;

    invoke-direct {v0, p0, p1}, LZ2/k;-><init>(Landroid/content/Context;LZ2/i;)V

    return-object v0
.end method


# virtual methods
.method public b()LZ2/k;
    .locals 2

    iget-object v0, p0, LZ2/l;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LZ2/l;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LZ2/l;->c(Landroid/content/Context;Ljava/lang/Object;)LZ2/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ2/l;->b()LZ2/k;

    move-result-object v0

    return-object v0
.end method
