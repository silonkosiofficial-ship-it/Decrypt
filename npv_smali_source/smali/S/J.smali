.class public abstract LS/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LS/J$a;->D:LS/J$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, LS/J;->a:LV/O0;

    return-void
.end method

.method public static final a()LV/O0;
    .locals 1

    sget-object v0, LS/J;->a:LV/O0;

    return-object v0
.end method
