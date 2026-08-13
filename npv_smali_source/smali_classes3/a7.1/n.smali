.class public final La7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/e;
.implements Lm7/e;


# static fields
.field public static final C:La7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La7/n;

    invoke-direct {v0}, La7/n;-><init>()V

    sput-object v0, La7/n;->C:La7/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Lo7/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 1

    sget-object v0, Lm7/j;->C:Lm7/j;

    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 0

    sget-object p1, La7/m;->a:La7/m;

    invoke-virtual {p1}, La7/m;->a()V

    return-void
.end method
