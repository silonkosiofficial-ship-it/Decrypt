.class public final La8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:La8/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/k$a;

    invoke-direct {v0}, La8/k$a;-><init>()V

    sput-object v0, La8/k$a;->a:La8/k$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/y;)LO7/f0;
    .locals 1

    const-string v0, "javaTypeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
