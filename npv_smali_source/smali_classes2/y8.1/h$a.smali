.class public final Ly8/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ly8/h$a;

.field private static final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/h$a;

    invoke-direct {v0}, Ly8/h$a;-><init>()V

    sput-object v0, Ly8/h$a;->a:Ly8/h$a;

    sget-object v0, Ly8/h$a$a;->D:Ly8/h$a$a;

    sput-object v0, Ly8/h$a;->b:Lx7/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/l;
    .locals 1

    sget-object v0, Ly8/h$a;->b:Lx7/l;

    return-object v0
.end method
