.class final LS/B1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/B1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/B1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/B1$a;

    invoke-direct {v0}, LS/B1$a;-><init>()V

    sput-object v0, LS/B1$a;->D:LS/B1$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LS/A1;
    .locals 19

    new-instance v18, LS/A1;

    move-object/from16 v0, v18

    const/16 v16, 0x7fff

    const/16 v17, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v17}, LS/A1;-><init>(LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;LM0/P;ILy7/k;)V

    return-object v18
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/B1$a;->a()LS/A1;

    move-result-object v0

    return-object v0
.end method
