.class public final synthetic Le/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/d$c;


# instance fields
.field public final synthetic a:Le/j;


# direct methods
.method public synthetic constructor <init>(Le/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/g;->a:Le/j;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Le/g;->a:Le/j;

    invoke-static {v0}, Le/j;->D(Le/j;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
