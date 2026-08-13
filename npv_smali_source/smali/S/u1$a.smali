.class public final LS/u1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LS/u1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Le0/j;
    .locals 2

    sget-object v0, LS/u1$a$a;->D:LS/u1$a$a;

    sget-object v1, LS/u1$a$b;->D:LS/u1$a$b;

    invoke-static {v0, v1}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    return-object v0
.end method
