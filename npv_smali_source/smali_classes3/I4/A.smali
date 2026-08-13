.class public final LI4/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK4/j;


# instance fields
.field private final a:LK4/m;


# direct methods
.method public constructor <init>(LK4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI4/A;->a:LK4/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LI4/A;->a:LK4/m;

    invoke-interface {v0}, LK4/m;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LI4/z;

    check-cast v0, LI4/k;

    invoke-direct {v1, v0}, LI4/z;-><init>(LI4/k;)V

    return-object v1
.end method
