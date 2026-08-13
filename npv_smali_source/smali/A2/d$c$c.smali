.class public final LA2/d$c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LA2/d$c$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA2/d$b;Landroid/database/sqlite/SQLiteDatabase;)LA2/c;
    .locals 2

    .prologue
    const-string v0, "refHolder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sqLiteDatabase"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LA2/d$b;->a()LA2/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, LA2/c;->s(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v0, LA2/c;

    invoke-direct {v0, p2}, LA2/c;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p1, v0}, LA2/d$b;->b(LA2/c;)V

    :cond_1
    return-object v0
.end method
