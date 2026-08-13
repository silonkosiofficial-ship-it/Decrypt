.class public abstract Lf7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lf7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf7/a$a;

    invoke-direct {v0}, Lf7/a$a;-><init>()V

    sput-object v0, Lf7/a;->a:Lf7/c;

    return-void
.end method

.method public static final a()Lf7/c;
    .locals 1

    sget-object v0, Lf7/a;->a:Lf7/c;

    return-object v0
.end method
