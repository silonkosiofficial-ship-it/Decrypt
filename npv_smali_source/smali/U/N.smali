.class public abstract LU/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LX0/h;

.field private static final b:LM0/P;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    new-instance v0, LX0/h;

    move-object/from16 v26, v0

    sget-object v1, LX0/h$a;->a:LX0/h$a$a;

    invoke-virtual {v1}, LX0/h$a$a;->a()F

    move-result v1

    sget-object v2, LX0/h$c;->a:LX0/h$c$a;

    invoke-virtual {v2}, LX0/h$c$a;->b()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LX0/h;-><init>(FILy7/k;)V

    sput-object v0, LU/N;->a:LX0/h;

    sget-object v0, LM0/P;->d:LM0/P$a;

    invoke-virtual {v0}, LM0/P$a;->a()LM0/P;

    move-result-object v0

    invoke-static {}, LT/l;->a()LM0/A;

    move-result-object v25

    const v30, 0xe7ffff

    const/16 v31, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v0 .. v31}, LM0/P;->c(LM0/P;JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Lq0/h;IIJLX0/r;LM0/A;LX0/h;IILX0/t;ILjava/lang/Object;)LM0/P;

    move-result-object v0

    sput-object v0, LU/N;->b:LM0/P;

    return-void
.end method

.method public static final a()LM0/P;
    .locals 1

    sget-object v0, LU/N;->b:LM0/P;

    return-object v0
.end method
