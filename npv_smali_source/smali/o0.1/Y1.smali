.class public abstract Lo0/Y1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/Y1$a;

    invoke-direct {v0}, Lo0/Y1$a;-><init>()V

    sput-object v0, Lo0/Y1;->a:Lo0/e2;

    return-void
.end method

.method public static final a()Lo0/e2;
    .locals 1

    sget-object v0, Lo0/Y1;->a:Lo0/e2;

    return-object v0
.end method
