.class public abstract LZ2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Li3/a;Li3/a;Ljava/lang/String;)LZ2/h;
    .locals 1

    new-instance v0, LZ2/c;

    invoke-direct {v0, p0, p1, p2, p3}, LZ2/c;-><init>(Landroid/content/Context;Li3/a;Li3/a;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Li3/a;
.end method

.method public abstract e()Li3/a;
.end method
