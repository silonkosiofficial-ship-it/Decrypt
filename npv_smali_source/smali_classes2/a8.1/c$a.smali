.class public final La8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:La8/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/c$a;

    invoke-direct {v0}, La8/c$a;-><init>()V

    sput-object v0, La8/c$a;->a:La8/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
