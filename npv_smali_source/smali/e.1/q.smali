.class public final synthetic Le/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le/r;


# direct methods
.method public synthetic constructor <init>(Le/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q;->C:Le/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/q;->C:Le/r;

    invoke-static {v0}, Le/r;->a(Le/r;)V

    return-void
.end method
