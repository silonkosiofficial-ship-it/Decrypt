.class public final synthetic Le/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le/t;


# direct methods
.method public synthetic constructor <init>(Le/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/s;->C:Le/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/s;->C:Le/t;

    invoke-static {v0}, Le/t;->a(Le/t;)V

    return-void
.end method
