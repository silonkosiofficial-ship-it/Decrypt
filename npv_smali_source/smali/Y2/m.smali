.class public abstract LY2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LC5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, LC5/h;->a()LC5/h$a;

    move-result-object v0

    sget-object v1, LY2/a;->a:LA5/a;

    invoke-virtual {v0, v1}, LC5/h$a;->d(LA5/a;)LC5/h$a;

    move-result-object v0

    invoke-virtual {v0}, LC5/h$a;->c()LC5/h;

    move-result-object v0

    sput-object v0, LY2/m;->a:LC5/h;

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, LY2/m;->a:LC5/h;

    invoke-virtual {v0, p0}, LC5/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method
