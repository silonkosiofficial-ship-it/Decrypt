.class public abstract Lu8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LO7/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu8/d$a;

    invoke-direct {v0}, Lu8/d$a;-><init>()V

    sput-object v0, Lu8/d;->a:LO7/a$a;

    return-void
.end method

.method public static final a()LO7/a$a;
    .locals 1

    sget-object v0, Lu8/d;->a:LO7/a$a;

    return-object v0
.end method
