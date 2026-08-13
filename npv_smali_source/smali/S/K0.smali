.class public final LS/K0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/K0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/K0;

    invoke-direct {v0}, LS/K0;-><init>()V

    sput-object v0, LS/K0;->a:LS/K0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LA/S;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:292)"

    const v2, 0x2d20cc2c

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LA/S;->a:LA/S$a;

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LT/z;->a(LA/S$a;LV/n;I)LA/S;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
