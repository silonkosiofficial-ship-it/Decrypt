.class public final Le/j$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Landroidx/lifecycle/X;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/X;
    .locals 1

    iget-object v0, p0, Le/j$d;->b:Landroidx/lifecycle/X;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Le/j$d;->a:Ljava/lang/Object;

    return-void
.end method

.method public final c(Landroidx/lifecycle/X;)V
    .locals 0

    iput-object p1, p0, Le/j$d;->b:Landroidx/lifecycle/X;

    return-void
.end method
