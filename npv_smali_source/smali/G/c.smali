.class public abstract LG/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LG/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG/c$a;

    invoke-direct {v0}, LG/c$a;-><init>()V

    sput-object v0, LG/c;->a:LG/b;

    return-void
.end method

.method public static final a(I)LG/b;
    .locals 1

    new-instance v0, LG/e;

    int-to-float p0, p0

    invoke-direct {v0, p0}, LG/e;-><init>(F)V

    return-object v0
.end method

.method public static final b(F)LG/b;
    .locals 2

    new-instance v0, LG/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LG/d;-><init>(FLy7/k;)V

    return-object v0
.end method
