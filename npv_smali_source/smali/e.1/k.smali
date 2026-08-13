.class public final synthetic Le/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le/j$f;


# direct methods
.method public synthetic constructor <init>(Le/j$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k;->C:Le/j$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/k;->C:Le/j$f;

    invoke-static {v0}, Le/j$f;->b(Le/j$f;)V

    return-void
.end method
