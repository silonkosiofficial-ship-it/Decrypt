.class public abstract LD0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LD0/f$a;->D:LD0/f$a;

    invoke-static {v0}, LE0/e;->a(Lx7/a;)LE0/m;

    move-result-object v0

    sput-object v0, LD0/f;->a:LE0/m;

    return-void
.end method

.method public static final a()LE0/m;
    .locals 1

    sget-object v0, LD0/f;->a:LE0/m;

    return-object v0
.end method
