.class public final Le3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field private final a:Lh7/a;


# direct methods
.method public constructor <init>(Lh7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/g;->a:Lh7/a;

    return-void
.end method

.method public static a(Li3/a;)Lf3/f;
    .locals 0

    invoke-static {p0}, Le3/f;->a(Li3/a;)Lf3/f;

    move-result-object p0

    invoke-static {p0}, La3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf3/f;

    return-object p0
.end method

.method public static b(Lh7/a;)Le3/g;
    .locals 1

    new-instance v0, Le3/g;

    invoke-direct {v0, p0}, Le3/g;-><init>(Lh7/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Lf3/f;
    .locals 1

    iget-object v0, p0, Le3/g;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/a;

    invoke-static {v0}, Le3/g;->a(Li3/a;)Lf3/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le3/g;->c()Lf3/f;

    move-result-object v0

    return-object v0
.end method
