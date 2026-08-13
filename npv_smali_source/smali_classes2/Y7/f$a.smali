.class public final LY7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LY7/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY7/f$a;

    invoke-direct {v0}, LY7/f$a;-><init>()V

    sput-object v0, LY7/f$a;->a:LY7/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/n;LO7/U;)Lt8/g;
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "descriptor"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
