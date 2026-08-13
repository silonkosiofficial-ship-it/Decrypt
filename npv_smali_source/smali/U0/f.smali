.class public abstract LU0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM0/s;IZJ)LM0/p;
    .locals 8

    new-instance v7, LM0/a;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, LU0/d;

    const/4 v6, 0x0

    move-object v0, v7

    move v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v6}, LM0/a;-><init>(LU0/d;IZJLy7/k;)V

    return-object v7
.end method

.method public static final b(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;IZJLY0/e;LR0/h$b;)LM0/p;
    .locals 9

    new-instance v7, LM0/a;

    new-instance v8, LU0/d;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p9

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, LU0/d;-><init>(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LR0/h$b;LY0/e;)V

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, v8

    move v2, p4

    move v3, p5

    move-wide v4, p6

    invoke-direct/range {v0 .. v6}, LM0/a;-><init>(LU0/d;IZJLy7/k;)V

    return-object v7
.end method
